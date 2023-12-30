We are making an automated plant watering system using Java. We have created a program that can
control our Arduino grove board sensing the moisture level and can pump water into the system
automatically when the soil is dry and is gets turned off when it’s enough wet. 


<img width="400" alt="Screen Shot 2023-12-29 at 11 58 41 PM" src="https://github.com/Adazaiya/water-system/assets/120755280/18f69c6a-6a55-4a53-bb1a-863f14fd1bf3">


## PROCESS:


Firstly we made sure the board works. We install firmata4j and other necessary libraries from maven.
We start the arduino followed by the moisture sensor and pump connected on the ports A0 and D2. We
then set the timertask. 


## Test:


After the whole set up is done we run our code, when the moisture sensor is already dipped in the
water the pump would not work and it is going to show that the soil is wet. As soon as we take out the
moisture sensor, the pump starts working sensing that the soil is dry. The LED screen will be showing the
moisture value midst the entire procedure. 
