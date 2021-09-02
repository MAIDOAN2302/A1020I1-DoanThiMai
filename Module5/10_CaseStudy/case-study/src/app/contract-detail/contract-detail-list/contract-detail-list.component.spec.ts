import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ContractDetailListComponent } from './contract-detail-list.component';

describe('ContractDetailListComponent', () => {
  let component: ContractDetailListComponent;
  let fixture: ComponentFixture<ContractDetailListComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ContractDetailListComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ContractDetailListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
