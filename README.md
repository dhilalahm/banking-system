# Banking System Small Project (Java)

## Overview

The Banking System project is a simple Java-based application that demonstrates core Object-Oriented Programming (OOP) concepts and basic Data Structures and Algorithms (DSA). The system allows users to manage bank accounts, perform transactions, and view transaction history through a simple menu.

## Features

- **Account Management:** Create Savings and Current accounts.
- **Transaction Management:** Deposit and withdraw funds.
- **Transaction History:** View transaction history for each account.
- **OOP Concepts:** Utilizes encapsulation, inheritance, and polymorphism.
- **Data Structures:** Implements `HashMap` for account management and `ArrayList` for transaction history.

## Project Structure

1. `Account.java`: Base class for bank accounts with common functionalities.
2. `SavingsAccount.java`: Class representing savings accounts with interest functionality.
3. `CurrentAccount.java`: Class representing current accounts with overdraft functionality.
4. `Transaction.java`: Class for handling and recording transactions.
5. `Bank.java`: Class for managing multiple accounts and transactions.
6. `BankingSystem.java`: Main class with a command-line interface for interacting with the system.

## OOP Concepts Demonstrated

| Concept | Where it is used |
|---|---|
| Abstraction | `Account` is an abstract class with an abstract `withdraw()` method |
| Inheritance | `SavingsAccount` and `CurrentAccount` extend `Account` |
| Polymorphism | `Bank` stores accounts as `Account` and calls `withdraw()`, which behaves differently per account type |
| Encapsulation | Private fields with getters; balance changes only through methods |
| Composition | `Bank` has a collection of accounts and transactions |

## Technologies

- Java
- Collections framework (`HashMap`, `ArrayList`)
- Eclipse IDE

## Getting Started

### Requirements

- JDK 17 or newer

### Run from the command line

```bash
git clone https://github.com/YOUR-USERNAME/banking-system.git
cd banking-system/src
javac com/dhilal/banking/model/*.java
java com.dhilal.banking.model.BankingSystem
```

## Example Usage

```
--- Banking System Menu ---
1. Create Savings Account
2. Create Current Account
3. Deposit
4. Withdraw
5. View Transactions
6. Exit
Choose an option: 1
Enter account number: ACC001
Enter account holder name: Dhilal
Enter initial balance: 1000
Enter interest rate: 2.5
Savings account created successfully.
```

Made by Dhilal Ahmaine
