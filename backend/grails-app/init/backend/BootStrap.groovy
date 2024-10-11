package backend


class BootStrap {

    CompanyService companyService
    def init = { servletContext ->

        Company volkswagen = companyService.save('Volkswagen', 'Vehicles')
        Company fiat = companyService.save('Fiat', 'Vehicles')
        Company cocaCola = companyService.save('Coca-Cola', 'Food')
        
    }
    def destroy = {
    }
}
