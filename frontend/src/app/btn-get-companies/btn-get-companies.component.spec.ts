import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BtnGetCompaniesComponent } from './btn-get-companies.component';

describe('BtnGetCompaniesComponent', () => {
  let component: BtnGetCompaniesComponent;
  let fixture: ComponentFixture<BtnGetCompaniesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [BtnGetCompaniesComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(BtnGetCompaniesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
