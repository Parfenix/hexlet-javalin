package gg.jte.generated.ondemand.courses;
import org.example.hexlet.model.Course;
public final class JteshowGenerated {
	public static final String JTE_NAME = "courses/show.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,1,1,3,3,5,5,6,6,6,7,7,7,9,9,9,9,9,1,1,1,1};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, Course course) {
		jteOutput.writeContent("\n");
		gg.jte.generated.ondemand.layout.JtemainGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n        <h2>");
				jteOutput.setContext("h2", null);
				jteOutput.writeUserContent(course.getName());
				jteOutput.writeContent("</h2>\n        <p>");
				jteOutput.setContext("p", null);
				jteOutput.writeUserContent(course.getDescription());
				jteOutput.writeContent("</p>\n        <a href=\"/courses\">Назад к списку курсов</a>\n    ");
			}
		});
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		Course course = (Course)params.get("course");
		render(jteOutput, jteHtmlInterceptor, course);
	}
}
