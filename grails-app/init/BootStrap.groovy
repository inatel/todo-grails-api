import br.edu.inatel.Task
import grails.util.Environment

class BootStrap {

    def init = { servletContext ->
        if(Environment.current == Environment.DEVELOPMENT) {
            createFakeData()
        }
    }

    def destroy = {
    }

    def createFakeData() {
        [
                'Learn Grails!',
                'Learn Groovy!',
                'Learn Gradle!',
                'Learn AngularJS1'
        ].each { task ->
            new Task(description: task).save()
        }
    }
}
