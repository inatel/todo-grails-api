package br.edu.inatel

import grails.rest.Resource

@Resource(uri='/api/tasks', formats = ['json', 'xml'])
class Task {

    Long id
    Boolean done = false
    String description

    static constraints = {
        description nullable: false, blank: false
    }
}
