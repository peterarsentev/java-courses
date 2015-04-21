Java. Путь от ученика до эксперта.
=================================
Практический Java курс. Бесплатно.
---------------------------------
Полный видео курс доступен по [ссылке](http://www.youtube.com/channel/UCLUYG3J5lYXs9gwz98aXIsQ)

Цель курса
----------
Всем привет. Меня зовут Петр. Я - Java разработчик с опытом работы более 6 лет. На своем опыте я знаю, как сложно освоить новый язык или технологию. Когда человек начинает изучать Java, первое, с чем он сталкивается, - это огромное количество технологий, фрейворков и библиотек. Человек теряется, что же ему учить. Создается впечатление, что порог вхождения в Java программисты очень высок. Данным курсом я хочу показать обратное. За пару месяцев интенсивного обучение по курсу вы овлаедете достаточными знаниями для устройтва на работу, прохождения собеседоавния и выполнения требуемых задач на работе.
Особо хотел бы отметить, что это практический курс, поэтому важную роль играет выполнение всех заданиий в каждом занятии. Только тогда будет положительный результат.

План курса
----------
Программа курса.
- Понятия JVM. Типы данных
- Синтаксис языка. Классы. Объекты. Условия. Циклы. Массивы
- Наследование. Инкапсуляция. Полиморфизм
- Коллекции. List, Set, Map, Tree
- Инструменты сборки. Хранения кода. Maven, Git
- Базовые понятия клиент-серверных приложений. Протоколы передачи
- Обработка http запросов в Java. Servlets. JSP
- Базовые понятие по HTML, CSS, JS
- Реализация MVC через Servlets. JSP
- Работа с базой данных. JDBC
- Базовый синтаксис SQL
- Использование POJO в работе с базами. ORM.
- Hibernate, Mapping
- Hibernate, CrUD
- HQL
- Spring IoC
- Spring Template + Hibernate
- Spring MVC

Занятие 1. Вводная
------------------
[Видео](http://www.youtube.com/watch?v=3Wn_mc12_yA)

Задания
- Какой Вы хотите добиться целью изучения языка Java?
- Как Вы можете проверить что цель достигнута?
- Какой срок реализации Вашей цели?

Занятие 2. Инструменты разработки
---------------------------------
[Видео](http://www.youtube.com/watch?v=lyezCD0lW88)
- JDK 1.7 http://www.oracle.com/technetwork/java/javase/downloads/jdk7-downloads-1880260.html
- Maven https://maven.apache.org/download.cgi?Preferred=ftp://mirror.reverse.net/pub/apache/
- Tomcat https://tomcat.apache.org/download-70.cgi
- MsysGit https://msysgit.github.io/
- PostgreSQL http://www.postgresql.org/download/
- IDEA https://www.jetbrains.com/idea/

Задания
- Установить все пакеты на своем компьюере. 
- Прописать необходимые переменные окружения.
- Проверить работоспособность каждого элемента из списка.

Занятие 3. Типы
---------------
[Видео](http://www.youtube.com/watch?v=gpZTcUBbdUA)

[Видео](http://www.youtube.com/watch?v=_UM8_vQZ4Tk)

Детальное описание https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html

Задания
- Создать класс Calculate.
- Добавить арифметические вычисления + - * / ^
- Сделать его адаптивным для типов int, short, long, float, double.

Занятие 4. Классы. Объекты, Циклы, Условия
------------------------------------------
[Видео](http://www.youtube.com/watch?v=EtBO3V-A-os)

Дополнительная информация
- http://docs.oracle.com/javase/tutorial/java/nutsandbolts/while.html
- http://docs.oracle.com/javase/tutorial/java/nutsandbolts/if.html

Задания
- Создать класс Calculator.
- Добавить два класс клиента ArgRunner, InteractRunner. 
- ArgRunner - данные получает из параметров запуска программы.
- InteractRunner - данные вводит пользователь.
- Добавить возможность выборка операции. Валидацию. Повторное использование результат вычисления. 

Занятие 5. Оформление кода
--------------------------
[Видео](http://www.youtube.com/watch?v=O_vgImIw-pE)

Детальное описание
- http://www.oracle.com/technetwork/articles/java/index-137868.html

Задания
- Проверить весь проект по пунктам из занятия.
- Поправить нарушения этих правил.

Занятие 6. Наследование. Инкапсуляция. Полиморфизм.
--------------------------
[Видео](http://www.youtube.com/watch?v=8jiiWwyHRY4)

Дополнительная информация
- https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html
- https://docs.oracle.com/javase/tutorial/java/IandI/polymorphism.html

Задания
- Создать программу для обслуживания клиники домашних питомцев.
- Должна быть возможно добавлять клиентов.
- Указывать какой питомец есть у клиента.
- Возможность искать по кличке питомца, по имени клиента.
- Редактировать имя клиента, имя питомца.
- Удалять клиента, питомца.
- Возможность валидации.


Занятие 7. Подключение Maven, IDEA, JUnit
--------------------------
[Видео](http://www.youtube.com/watch?v=rlajofdMnhw)

Дополнительная информация
- http://maven.apache.org/guides/getting-started/maven-in-five-minutes.html
- https://www.jetbrains.com/idea/features/ant_maven.html
- http://junit.org/
- http://en.wikipedia.org/wiki/Black-box_testing

Задания
- Добавить maven для проекта Клиника. Калькулятор.
- Добавить тесты в эти проекты.

Занятие 8. Исключительные ситуации. Exception, Error
--------------------------
[Видео](http://www.youtube.com/watch?v=rlajofdMnhw)

Дополнительная информация
- https://docs.oracle.com/javase/tutorial/essential/exceptions/

Задания
- Заменить сообщения о нарушении логики в приложении на пробрасывания исключительных ситуаций.
- Добавить тесты, которые проверяют эти исключения.

Занятие 9. Создание исполняемого файла. Manifest
--------------------------
[Видео](http://www.youtube.com/watch?v=rlajofdMnhw)

Дополнительная инфармация 
https://maven.apache.org/plugins/maven-jar-plugin/examples/manifest-customization.html
https://docs.oracle.com/javase/tutorial/deployment/jar/manifestindex.html
Задания
- Сделать прогрумму клиники исполняемой. 
- Добавить файл README.md и описать в нем заначение программы, возможности.
- Попросить своих друзей попробовать использовать программу.
- Получить впечатление, отзывы от друзей. Провести работу по исправлению.

Занятие 10. Коллекции. List, Set, Map, Tree.
--------------------------
[Видео](http://youtu.be/toaYofpHwUg)

дополнительная информация
ftp://ftp.fixme.ch/free_for_all/Ebook/IT%20eBooks/Software%20Engineering/System%20&%20Scientific/Java/Java%20Generics%20and%20Collections/Java%20Generics%20and%20Collections.pdf

Задания
1. Создать свою реализацию коллекций ArrayList - на базе массива.
2. Создать свою реализацию LinkedList - на базе связанных списков.
3. Заменить массивы в проекте клиника на вашу реализацию.

Занятие 11. Коллекции. Equals. hashCode
--------------------------
[Видео](http://www.youtube.com/watch?v=rlajofdMnhw)

Дополнительная информация
http://uet.vnu.edu.vn/~chauttm/e-books/java/Effective.Java.2nd.Edition.May.2008.3000th.Release.pdf

Задания
- Создать класс пользователь.
- Провести эксперимент с коллекциями ArrayList, HashSet, HashMap
- Перекрыть equals, hashCode.
- Перекрыть только equals
- Перекрыть только hashCode
- Не перекрывать
- Объяснить результаты работы коллекций. Метолов contains, add, size, put

Занятие 12. Многопоточность
--------------------------
[Видео](http://www.youtube.com/watch?v=rlajofdMnhw)

Дополнительная информация
https://docs.oracle.com/javase/tutorial/essential/concurrency/index.html

Задания
- Реализовать эммуляцию клиентов и администратора в проекте клинила для домашних питомцев.

Занятие 13. GUI. Игра сапер.
--------------------------
[Видео](http://www.youtube.com/watch?v=rlajofdMnhw)

Дополнительная информация
http://docs.oracle.com/javase/tutorial/uiswing/

Задания
- Завершить игру сапер реализованную на основе Swing

Занятие 14. Клиент-сервер. Протоколы передачи.
--------------------------
[Видео](http://www.youtube.com/watch?v=rlajofdMnhw)

Дополнительная информация
http://en.wikipedia.org/wiki/Client%E2%80%93server_model
http://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol

Задания
- Расширить модель User.
- Сделать возможность поиска.

Занятие 15. JSP, Servlet, JTLS
--------------------------
[Видео](http://www.youtube.com/watch?v=rlajofdMnhw)

Дополнительная информация
http://www.oracle.com/technetwork/articles/java/servlets-jsp-140445.html

Задания
- Реализовать проект клинику домашних животных в Web приложение

Занятие 16. Тестирование Servlet. Mockito
-----------------------------------------
[Видео](http://www.youtube.com/watch?v=rlajofdMnhw)

Дополнительная информация

Задания

Занятие 17. HTML, CSS, JS
--------------------------
[Видео](http://www.youtube.com/watch?v=rlajofdMnhw)

Задания

Занятие 18. SQL
--------------------------
[Видео](http://www.youtube.com/watch?v=rlajofdMnhw)

Задания

Занятие 19. JDBC
--------------------------
[Видео](http://www.youtube.com/watch?v=rlajofdMnhw)

Задания

Занятие 20. Hibernate, Config
--------------------------
[Видео](http://www.youtube.com/watch?v=rlajofdMnhw)

Задания

Занятие 21. Hibernate, Mapping
--------------------------
[Видео](http://www.youtube.com/watch?v=rlajofdMnhw)

Задания

Занятие 22. Hibernate, Query
--------------------------
[Видео](http://www.youtube.com/watch?v=rlajofdMnhw)

Задания

Занятие 23. Spring, IoC
--------------------------
[Видео](http://www.youtube.com/watch?v=rlajofdMnhw)

Задания

Занятие 24. Spring Template, Hibernate
--------------------------
[Видео](http://www.youtube.com/channel/UCLUYG3J5lYXs9gwz98aXIsQ)

Задания

Занятие 25. Spring MVC
--------------------------
[Видео](http://www.youtube.com/channel/UCLUYG3J5lYXs9gwz98aXIsQ)

Задания

Занятие 26. Spring Security
--------------------------
[Видео](http://www.youtube.com/watch?v=rlajofdMnhw)

Задания
