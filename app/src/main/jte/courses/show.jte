@import org.example.hexlet.model.Course
@param Course course

@template.layout.main(
    content = @`
        <h2>${course.getName()}</h2>
        <p>${course.getDescription()}</p>
        <a href="/courses">Назад к списку курсов</a>
    `
)