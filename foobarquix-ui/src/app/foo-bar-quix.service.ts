import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Result } from './model/result';

@Injectable({
  providedIn: 'root',
})
export class FooBarQuixService {
  apiURL = 'http://localhost:8080/foo-bar-quix';

  constructor(private _http: HttpClient) {}

  convertNumber(inputNumber) {
    return this._http.get<Result>(this.apiURL + '/' + inputNumber);
  }
}
