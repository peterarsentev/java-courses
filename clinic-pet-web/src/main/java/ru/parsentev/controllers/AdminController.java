package ru.parsentev.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.parsentev.models.Role;
import ru.parsentev.store.Storage;
import ru.parsentev.store.Storages;

/**
 * TODO: comment
 * @author parsentev
 * @since 30.05.2015
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private Storages storages;

	@RequestMapping(value = "/roles", method = RequestMethod.GET)
	public String showRoles(ModelMap model) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		//current user
		String login = auth.getName();

		model.addAttribute("roles", storages.roleStorage.values());
		return "admin/roles";
	}

	@RequestMapping(value = "/new", method = RequestMethod.POST)
	public String saveRole(@ModelAttribute Role role, ModelMap model) {
		storages.roleStorage.add(role);
		return "redirect:roles";
	}
}
