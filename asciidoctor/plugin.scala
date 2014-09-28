import plugin._
import plugin.PluginSystem.Renderer
import play.twirl.api.Html

val pluginDef = ScalaPlugin.define(id, version, author, url, description)

val asciidocRenderer: Renderer = new Renderer(Seq(".adoc", ".asciidoctor"), new Renderer.Render() {
  override def render(filePath: List[String],
        fileContent: String,
        branch: String,
        repository: service.RepositoryService.RepositoryInfo,
        enableWikiLink: Boolean,
        enableRefsLink: Boolean,
        context: app.Context): Html = {
  
    
  
  }
})

pluginDef.addRenderer(asciidocRenderer)

PluginSystem.install(pluginDef)
