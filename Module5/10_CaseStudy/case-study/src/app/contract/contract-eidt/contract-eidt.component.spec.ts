import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ContractEidtComponent } from './contract-eidt.component';

describe('ContractEidtComponent', () => {
  let component: ContractEidtComponent;
  let fixture: ComponentFixture<ContractEidtComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ContractEidtComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ContractEidtComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
