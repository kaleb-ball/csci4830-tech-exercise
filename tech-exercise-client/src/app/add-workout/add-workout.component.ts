import { HttpClient } from '@angular/common/http';
import {Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { environment } from '../../environments/environment';


@Component({
  selector: 'app-add-workout',
  templateUrl: './add-workout.component.html',
  styleUrls: ['./add-workout.component.scss']
})
export class AddWorkoutComponent implements OnInit {

  form : FormGroup
  submitted = false;

  constructor(
    private http : HttpClient,
    private fb : FormBuilder
  ) { }

  ngOnInit(): void {
    this.form = this.fb.group({
      length: ['', Validators.required],
      type: ['', Validators.required],
      date: ['', Validators.required]
    });
  }

  onSubmit(form: FormGroup) {
    this.submitted = true;
    let body = {
      length : form.get('length').value,
      date : form.get('date').value,
      type : form.get('type').value
    }
    this.http.post(environment.apiUrl + '/api/workout/addWorkout', body).subscribe(data => {
      let d = data;
    });
  }

}
