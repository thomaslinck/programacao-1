package bankExercise.bank;

import java.util.UUID;

abstract class Account {
    float currentAmount;
    UUID accountUUID;

    Account(){
        this.accountUUID = UUID.randomUUID();
    }

    void deposit(float amount){
        if (depositValidation())
            this.currentAmount += amount;
    }

    void withdraw(float amount){
        if(withdrawValidation())
            this.currentAmount -= amount;
    }

    abstract boolean depositValidation();
    abstract boolean withdrawValidation();
}
