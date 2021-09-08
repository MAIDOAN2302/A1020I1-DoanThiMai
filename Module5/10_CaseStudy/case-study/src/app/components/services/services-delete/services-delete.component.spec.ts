import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ServicesDeleteComponent } from './services-delete.component';

describe('ServicesDeleteComponent', () => {
  let component: ServicesDeleteComponent;
  let fixture: ComponentFixture<ServicesDeleteComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ServicesDeleteComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ServicesDeleteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
