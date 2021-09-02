import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ContractDetailEditComponent } from './contract-detail-edit.component';

describe('ContractDetailEditComponent', () => {
  let component: ContractDetailEditComponent;
  let fixture: ComponentFixture<ContractDetailEditComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ContractDetailEditComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ContractDetailEditComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
