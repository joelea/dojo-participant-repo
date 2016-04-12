class BankAccount
  def initialize(printer)
    @printer = printer
  end 

  def deposit(amount)
  end

  def withdraw(amount)
  end

  def print_statement
    @printer.print_line("DATE | AMOUNT | BALANCE")
  end
end
