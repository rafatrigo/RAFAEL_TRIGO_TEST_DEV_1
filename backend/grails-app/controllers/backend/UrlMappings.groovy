package backend

class UrlMappings {

    static mappings = {

        "/companies"(controller: 'company', action: 'getCompanies')

        // "/$controller/$action?/$id?(.$format)?"{
        //     constraints {
        //         // apply constraints here
        //     }
        // }

        // "/"(view:"/index")
        // "500"(view:'/error')
        // "404"(view:'/notFound')
    }
}
