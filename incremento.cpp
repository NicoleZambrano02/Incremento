#include <iostream>
using namespace std;
int main() {
  float suelini;
  float cat;
  float suelfin,inc;
  cout<<"Ingrese el Sueldo Actual"<<endl;
  cin>>suelini;
  cout<<"Ingrese la categoria a la que pertenece"<<endl;
  cin>>cat;
  if(cat==1){
      suelfin=(suelini*0.15)+suelini;
      inc=0.15;
  }
  else if(cat==2){
      suelfin=(suelini*0.1)+suelini;
      inc=0.1;
  }
  else if(cat==3){
      suelfin=(suelini*0.08)+suelini;
      inc=0.08;
  }
  else if(cat==4){
      suelfin=(suelini*0.07)+suelini;
      inc=0.07;
  }
  else
      cout<<"Categoria no identificada"<<endl;
  cout<<"Su sueldo inicial es: ";
  cout<<suelini;
  cout<<" con un incremento de: ";
  cout<<inc;
  cout<<" dando un total de: ";
  cout<<suelfin<<endl;
  return 0;
}
