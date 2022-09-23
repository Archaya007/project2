
package com.kgisl.spring.Controller;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kgisl.spring.model.Book;
@Controller
public class GreetController {
    @Autowired
    private DataSource dataSource;
    static {
        System.out.println("GreetController called");
    }
    @RequestMapping(path = "/greet")
    public String greet(ModelMap model) {
        String greet = " Hello !!! How are You?";
        model.addAttribute("greet", greet);
        System.out.println(greet);
        JdbcTemplate jdbcTemplateObject = new JdbcTemplate(dataSource);
        // Custom SQL query
        String SQL = "select * from book";
        List<Book> books = jdbcTemplateObject.query(
                SQL, new BeanPropertyRowMapper<Book>(Book.class));
        System.out.println(books.size());
        // books.forEach(System.out::println);
        return "greet";
    } 
}