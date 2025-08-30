# Manila Classico
*A Barbershop Queuing and Reservation System*  

## 📌 Overview  
**Manila Classico v2** is a desktop-based barbershop management system developed in **Java (Swing & AWT)** using **NetBeans**.  
The system is designed to help barbershops streamline their daily operations by managing reservations, queues, barbers, services, and payments in one unified platform.  

This project was developed as part of our **Bachelor of Science in Information Technology** program with a specialization in **Mobile and Web Applications**.  

---

## 🎯 Objectives  
- Provide a simple and user-friendly system for barbershops.  
- Enable **efficient queuing and reservations** for customers.  
- Support **management of services, barbers, and schedules**.  
- Generate an organized and reliable data flow for barbershop operations.  

---

## ✨ Features  
- **Reservation Management** – Book appointments with details (customer, service, barber, date, time).  
- **Barber Management** – Add, edit, and manage barber profiles and schedules.  
- **Service Catalog** – Define haircut, grooming, and other service options with corresponding prices.  
- **Payment Tracking** – Record payment methods and total charges for reservations.  
- **Queueing System** – Organize walk-ins and reservations in real time.  
- **Data Consistency** – Non-editable tables for secure and reliable records.  

---

## 🛠️ Technologies Used  
- **Language**: Java  
- **GUI Toolkit**: Swing, AWT  
- **IDE**: NetBeans  
- **Build Tool**: Apache Ant (build.xml)  
- **Database**: SQLite or MySQL

---

## 🚀 Installation & Setup  

### Requirements  
- Java Development Kit (JDK) 8+  
- NetBeans IDE (with Swing/AWT support)  
- (Database setup instructions if using MySQL or another DB)  

### Steps  
1. Clone this repository:  
   ```bash
   git clone https://github.com/theojohnsosa/manila-classico-v2.git

2. Open the project in **NetBeans**.

3. Build and run the project using `build.xml` or NetBeans’ Run command.

4. Configure the database connection (if applicable) inside the `src/manila/config` package.

---

## 📖 Usage

1. **Login/Register** – Start by logging in (if implemented).
2. **Book a Reservation** – Enter customer details, select a service, barber, and schedule.
3. **Manage Queue** – Track ongoing reservations and walk-in customers.
4. **Record Payments** – Choose payment method and confirm charges.
5. **View Records** – Review daily transactions and schedules.

---

## 📂 Project Structure

```
manila-classico-v2/
│── src/
│   └── manila/        # Main application source code
│── build/             # Build output
│── nbproject/         # NetBeans project files
│── manifest.mf        # Manifest file
│── build.xml          # Ant build configuration
```

---

## 👨‍💻 Contributors

* **Theojohn Sosa** – Lead Developer
* *(Add team members here with roles)*

---

## 📜 License

This project is developed for **academic purposes**.
You may use or adapt it for learning and educational projects.
