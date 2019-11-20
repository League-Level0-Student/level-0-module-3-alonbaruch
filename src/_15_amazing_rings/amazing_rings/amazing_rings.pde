int X1 = 600; int X2 = 1400;
int speedX1 = 5; int speedX2 = -5;
void setup(){
  

  
  
  
  
  background(#8C9EAF);
 
  size(2000,2000);
  
}

    void draw(){
  background(#8C9EAF);

      for (int i=100 ; i>=0;i--){

 noFill();
  ellipse(X1,500,5*i,5*i);
}
 X1+=speedX1;
for (int i=100 ; i>=0;i--){

  ellipse(X2,500,5*i,5*i);
}
X2+=speedX2;

      if(X1==1600){
    speedX1*=-1;
  }
   if(X2==400){
     speedX2*=-1;
   }

  
                           
  
                           
  
  
  
  
  
  
  
  
    }
