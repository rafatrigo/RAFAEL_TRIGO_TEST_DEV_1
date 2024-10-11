package backend

import grails.gorm.transactions.Transactional

@Transactional
class CompanyService {

    def save(String name, String segment) {

        Company company = new Company(name: name, segment: segment)

        try{
            company.save(failOnError: true)
        }catch(Exception e){
            throw new Exception("Error saving company: " + e.message)
        }

    }

    List<Company> getCompanies(){
        return Company.list()
    }
}
