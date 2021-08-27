import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CountdownTimerSetComponent } from './countdown-timer-set.component';

describe('CountdownTimerSetComponent', () => {
  let component: CountdownTimerSetComponent;
  let fixture: ComponentFixture<CountdownTimerSetComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CountdownTimerSetComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CountdownTimerSetComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
