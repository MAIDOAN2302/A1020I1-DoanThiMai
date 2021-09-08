import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ContractDetailCreateComponent } from './contract-detail-create.component';

describe('ContractDetailCreateComponent', () => {
  let component: ContractDetailCreateComponent;
  let fixture: ComponentFixture<ContractDetailCreateComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ContractDetailCreateComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ContractDetailCreateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
