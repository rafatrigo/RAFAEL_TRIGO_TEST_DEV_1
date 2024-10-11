package backend

import grails.rest.RestfulController

class CompanyController extends RestfulController {

    static responseFormats = ['json']

    CompanyController(){
        super(Company)
    }

    CompanyService companyService
    def getCompanies() {

        try {
            List<Company> companies = companyService.getCompanies()
            respond companies, [status: 200]
        } catch(Exception e) {
            respond "message: 'Error geting companies'", [status: 500]
        }
    }
}
