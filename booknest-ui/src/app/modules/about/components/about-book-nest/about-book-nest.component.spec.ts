import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AboutBookNestComponent } from './about-book-nest.component';

describe('AboutBookNestComponent', () => {
  let component: AboutBookNestComponent;
  let fixture: ComponentFixture<AboutBookNestComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [AboutBookNestComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AboutBookNestComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
