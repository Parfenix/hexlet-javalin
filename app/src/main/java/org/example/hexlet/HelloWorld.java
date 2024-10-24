package org.example.hexlet;

import io.javalin.Javalin;
import io.javalin.rendering.template.JavalinJte;
import org.example.hexlet.dto.courses.CoursesPage;
import org.example.hexlet.model.Course;

import java.util.Arrays;
import java.util.List;

import static io.javalin.rendering.template.TemplateUtil.model;

public class HelloWorld {
  public static void main(String[] args) {
    var app = Javalin.create(config -> {
      config.bundledPlugins.enableDevLogging();
      config.fileRenderer(new JavalinJte());
    });

    app.get("/courses", ctx -> {
        List<Course> courses = Arrays.asList(
                new Course(1L, "Курс 1", "Описание курса 1"),
                new Course(2L, "Курс 2", "Описание курса 2"),
                new Course(3L, "Курс 3", "Описание курса 3")
        );
        var header = "Курсы по программированию";
        var page = new CoursesPage(courses, header);
        ctx.render("courses/index.jte", model("page", page));

    });

      app.get("/courses/{id}", ctx -> {
          Long id = Long.valueOf(ctx.pathParam("id"));
          Course course = new Course(id, "Курс " + id, "Описание курса " + id);
          ctx.render("courses/show.jte", model("course", course));
      });


      app.start(7070);
  }
}
