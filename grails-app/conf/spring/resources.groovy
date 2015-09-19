import br.edu.inatel.Task
import grails.rest.render.json.JsonRenderer

// Place your Spring DSL code here
beans = {
    taskRenderer(JsonRenderer, Task) {
        excludes = ['class']
    }
}
