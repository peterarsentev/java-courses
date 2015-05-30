package ru.parsentev.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;
import ru.parsentev.models.User;
import ru.parsentev.store.Storages;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * TODO: comment
 * @author parsentev
 * @since 30.05.2015
 */
@Service("provider")
public class CustomAuthenticationProvider implements AuthenticationProvider {

	@Autowired
	private Storages storages;

	@Override
	@Transactional
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		String login = authentication.getName();
		String password = authentication.getCredentials().toString();
		final User user = storages.userStorage.findByAuth(login, password);
		if (user != null) {
			List<GrantedAuthority> grantedAuths = new ArrayList<>();
			grantedAuths.add(new SimpleGrantedAuthority(user.getRole().getName()));
			return new UsernamePasswordAuthenticationToken(login, password, grantedAuths);
		} else {
			return null;
		}
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return authentication.equals(UsernamePasswordAuthenticationToken.class);
	}
}
