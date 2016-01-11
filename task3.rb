class Atm
    TRIES = 3
    attr_accessor :card, :cash, :tries_left

    def initialize(card, cash)
        @card = card
        @cash = cash
        @tries_left = TRIES
    end

    def insert_pin
        print "Welcome at Skrobis Financial Solutions.\nPlease enter PIN number to continue.\n"
        pin_number = gets.chomp.to_i
        while tries_left > 1
            if pin_correct?(pin_number)
                choose_action
            else
                @tries_left = tries_left - 1
                print "Wrong PIN. Try again. Tries left: #{tries_left}\n"
                insert_pin
            end
        end
        if tries_left == 0
            abort("Card has been inactivated due to too many wrong insertions of PIN number.\nPlease, contact you back to resolve the issue.")
        end
    end

    def choose_action
        print "PIN correct\n"
        print "Please select action.\nFor account balance enter 1.\nTo withdraw money enter 2.\nTo deposit money press 3.\n"
        action = gets.chomp
        case action
            when '1'
                show_balance
            when '2'
                withdraw
            when '3'
                deposit
            when '4'
                abort("Thank you for using Skrobis Financial Solutions!")
            else
                print "Illegible command\n"
                choose_action
        end
    end

    private

    def pin_correct?(pin_from_input)
        card.pin_number == pin_from_input.to_i
    end

    def deposit
        print "Please input amount\n"
        amount = gets.chomp().to_i
        card.balance = card.balance + amount
        print "Operation successful.\nBalance: #{card.balance}\n"
    end

    def show_balance
        print "Balance: #{card.balance}\n"
    end

    def withdraw
        print "Please input amount\n"
        amount = gets.chomp().to_i
        if cash >= amount && card.balance >= amount
            card.balance = card.balance - amount.to_i
            @cash = cash - amount.to_i
            print "Withdrawn: #{amount.to_i }\nBalance: #{card.balance}\n"
        elsif cash < amount
            print "Not enough money to perform this transaction.\n"
        end
    end
end

class Card
    attr_accessor :balance, :pin_number

    def initialize(balance, pin_number)
        @balance = balance
        @pin_number = pin_number
    end
end

card = Card.new(1000, 1234)
atm = Atm.new(card, 1500)
atm.insert_pin
