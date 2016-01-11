class Pralindrome
    TEN_FIRST_PRIMES = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29]
    TASK_RANGE = 2..10000

    def self.find_the_highest
        numbers = TASK_RANGE
        TEN_FIRST_PRIMES.each do |prime|
            numbers = numbers.select do |number|
                (number % prime != 0 && palindrome?(number)) || prime == number
            end
        end
      numbers.last
    end

    private

    def self.palindrome?(number)
        number.to_s == number.to_s.reverse
    end
end

p Pralindrome.find_the_highest

