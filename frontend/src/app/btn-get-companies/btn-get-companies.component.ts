import { Component, Input } from '@angular/core';
import { CompanyService } from '../company.service';

interface Company {
  name: string;
  segment: string;
}

@Component({
  selector: 'app-btn-get-companies',
  standalone: false,
  // imports: [],
  templateUrl: './btn-get-companies.component.html',
  styleUrl: './btn-get-companies.component.scss'
})
export class BtnGetCompaniesComponent {
  companies: Company[] = [];
  filter: String = '';
  
  @Input() label: String = 'Get Companies';

  constructor(private companyService: CompanyService) {}
  
  handleClick() {
    
    this.companyService.getCompanies().subscribe(
      (data) => {
        this.companies = data;
      },
      (error) => {
        console.error('Error to get companies', error);
      }
    );

  }

  filterCompanies(): Company[] {
    return this.companies.filter(
      company => 
        company.name.toLowerCase().includes(this.filter.toLowerCase()) ||
        company.segment.toLowerCase().includes(this.filter.toLowerCase())
    )
  }
}
