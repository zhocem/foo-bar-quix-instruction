import { Component, OnInit, OnDestroy } from '@angular/core';
import { Subscription } from 'rxjs';
import { FooBarQuixService } from '../foo-bar-quix.service';

@Component({
  selector: 'app-foo-bar-quix',
  templateUrl: './foo-bar-quix.component.html',
})
export class FooBarQuixComponent implements OnInit, OnDestroy {
  results: NumberConverted[] = [];

  constructor(private fooBarQuixService: FooBarQuixService) {}

  ngOnInit(): void {}

  ngOnDestroy(): void {}

  convertNumber(inputNumber: number): void {
    this.fooBarQuixService.convertNumber(inputNumber).subscribe((data) => {
      this.results.push({ numberToConvert: inputNumber, result: data.result });
    });
  }
}

interface NumberConverted {
  numberToConvert: number;
  result: string;
}
