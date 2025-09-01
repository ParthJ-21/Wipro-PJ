import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SuccessComp } from './success-comp';

describe('SuccessComp', () => {
  let component: SuccessComp;
  let fixture: ComponentFixture<SuccessComp>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [SuccessComp]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SuccessComp);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
