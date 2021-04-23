import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Todo } from 'src/app/models/todo';
import { TodoService } from 'src/app/services/todo.service';
import { environment } from 'src/environments/environment';

@Component({
  selector: 'app-read-all',
  templateUrl: './read-all.component.html',
  styleUrls: ['./read-all.component.css']
})
export class ReadAllComponent implements OnInit {

  list: Todo[] = [
    {
      titulo: "Teste",
      dataParaFinalizar: new Date,
      finalizado: false
    },
    {
      titulo: "Teste 2",
      dataParaFinalizar: new Date,
      finalizado: false
    }
  ]
  constructor(private service: TodoService) { }

  ngOnInit(): void {


  }

  findAll(): void {
    this.service.findAll().subscribe((resposta) => {
      this.list = resposta;
    })
  }


}
