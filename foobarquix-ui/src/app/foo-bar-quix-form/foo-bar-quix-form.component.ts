import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import {
  FormBuilder,
  FormControl,
  FormGroup,
  Validators,
} from '@angular/forms';

@Component({
  selector: 'app-foo-bar-quix-form',
  templateUrl: './foo-bar-quix-form.component.html',
})
export class FooBarQuixFormComponent implements OnInit {
  @Output() submitNumberOutput = new EventEmitter<number>();

  foobarquixForm: FormGroup;
  numberRegEx = /^[1-9]\d*$/;

  constructor(private formBuilder: FormBuilder) {}

  ngOnInit(): void {
    this.foobarquixForm = this.formBuilder.group({
      inputNumber: [
        null,
        [Validators.required, Validators.pattern(this.numberRegEx)],
      ],
    });
  }

  submitNumber(form): void {
    this.submitNumberOutput.emit(form.inputNumber);
  }

  getErrorInput() {
    return this.foobarquixForm.get('inputNumber').hasError('required')
      ? 'Field is required'
      : this.foobarquixForm.get('inputNumber').hasError('pattern')
      ? 'Not a valid number'
      : '';
  }
}
