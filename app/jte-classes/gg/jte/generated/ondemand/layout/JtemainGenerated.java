package gg.jte.generated.ondemand.layout;
import gg.jte.Content;
public final class JtemainGenerated {
	public static final String JTE_NAME = "layout/main.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,1,1,20,20,20,20,28,28,28,1,1,1,1};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, Content content) {
		jteOutput.writeContent("\n<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n    <meta charset=\"UTF-8\">\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n    <title>Мой сайт</title>\n</head>\n<body>\n    <header>\n        <h1><a href=\"/\">Главная</a></h1>\n        <nav>\n            <a href=\"/courses\">Курсы</a>\n            <a href=\"/users\">Пользователи</a>\n        </nav>\n    </header>\n\n    <main>\n        ");
		jteOutput.setContext("main", null);
		jteOutput.writeUserContent(content);
		jteOutput.writeContent("\n    </main>\n\n    <footer>\n        <p>Посетите мой <a href=\"https://github.com/Parfenix\" target=\"_blank\">GitHub</a></p>\n    </footer>\n</body>\n</html>\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		Content content = (Content)params.get("content");
		render(jteOutput, jteHtmlInterceptor, content);
	}
}
