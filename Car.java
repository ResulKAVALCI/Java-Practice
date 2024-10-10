 class Car {
    //Nitelikler

     String type;
     String model;
     String color;
     int Speed;
     int SpeedLimit = 180;

     Car(String model, int Speed, String color)
     {
         this.model = model;
         this.Speed = Speed;
         this.color = color;
         System.out.println("Parametreli Kururcu metot kullanıld");

     }
     Car()
     {
         System.out.println("Boş kurucu metot kullanıldı");
     }

     void increaseSpeed(int increment)
     {
         if((Speed + increment) < SpeedLimit)
         {
             this.Speed += increment;
         }
     }

     void DecreaseSpeed(int decrease)
     {
         if(Speed > 0)
         {
             Speed-=decrease;
         }
     }

     void printSpeed()
     {
         System.out.println("Hızınız: "+ Speed);
     }

     void printInfo()
     {
         System.out.println("Model: "+ this.model);
         System.out.println("Color: "+ this.color);
         System.out.println("Speed: "+ this.Speed);
     }
}
