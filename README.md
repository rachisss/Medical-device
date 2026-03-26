# Medical Device Management System

## Description
Object-Oriented Programming project - Medical Device Management System

A Java application for managing medical devices with their properties including type, material, price, and category.

## Project Structure
```
Medical-device/
├── src/
│   ├── DispozitivMedical.java    # Model class for medical devices
│   └── Main.java                  # Main application with menu
└── README.md
```

## Features
- ✅ Add medical device details (name and material)
- ✅ Set prices for devices
- ✅ Assign categories (Diagnostic/Therapy)
- ✅ Display all device information
- ✅ Interactive menu system

## How to Run

### Requirements
- Java 8 or higher
- IntelliJ IDEA or any Java IDE

### Steps
1. Clone the repository:
   ```bash
   git clone https://github.com/rachisss/Medical-device.git
   ```

2. Open the project in IntelliJ IDEA

3. Navigate to `src/Main.java`

4. Run the `main()` method (or press Ctrl+Shift+F10)

5. Follow the menu options:
   - **Option 1**: Enter medical device details
   - **Option 2**: Set prices
   - **Option 3**: Set categories
   - **Option 4**: View all devices
   - **Option 5**: Exit

## Example Usage
```
=== MENIU ===
1. Introducere detalii dispozitive
2. Setare pret
3. Setare categorie
4. Afisare dispozitive
5. Iesire
Selectati o optiune: 1

=== Introduceti detaliile dispozitivelor medicale ===

Dispozitiv nr. 1
Introduceti numele dispozitivului: Spirometru
Introduceti materialul (ex: titan, plastic medical): plastic medical
```

## Class Details

### DispozitivMedical.java
- **Attributes**: tipDispozitiv, material, pret, categorie
- **Methods**: 
  - Constructors with different parameter combinations
  - Getters and setters for all attributes
  - toString() method for displaying device information

### Main.java
- **Static Variables**: d1, d2, d3 (three medical device instances)
- **Methods**:
  - `introducereDispozitiv()` - Input device details
  - `setPret()` - Set device prices
  - `setCategorie()` - Set device categories
  - `afiseazaDispozitive()` - Display all devices

## Author
Created as an Object-Oriented Programming course project

## License
This project is public and open for educational purposes.