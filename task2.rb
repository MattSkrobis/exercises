class Person
    attr_accessor :tasks

    def initialize(tasks)
        @tasks = tasks
    end

    def show_completed_tasks
        completed_tasks = tasks.select do |task|
            task.completed
        end
        completed_tasks.each { |completed_task| p completed_task.name }
    end
end

class Task
    attr_accessor :name, :completed

    def initialize(name, completed)
        @name = name
        @completed = completed
    end
end

fred = Person.new([Task.new("Be nice to people", false),
                   Task.new("Assembly an M26", true),
                   Task.new("Try not to die", true),
                   Task.new("Eat food", false),
                   Task.new("Sing a song", true),
                   Task.new('Take things easy', false)])

fred.show_completed_tasks

