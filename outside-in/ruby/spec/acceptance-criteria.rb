require 'rubygems'
require 'bundler/setup'

require 'rspec/mocks'
require 'rspec'

require_relative '../main/bank-account'

def set_today(today)
end

describe BankAccount do

  before :each do
    @account = BankAccount.new()
    @clock = double("clock")
    @printer = double("printer")
  end

  it "Allow printing of a statement in reverse chronological order" do
    set_today("01/04/2014")
    @account.deposit(1000)

    set_today("02/04/2014")
    @account.withdraw(100)

    set_today("01/05/2014")
    @account.deposit(500)
    
    @account.print_statement()

    expect(@printer).to receive(:print_line).with("DATE | AMOUNT | BALANCE").ordered
    expect(@printer).to receive(:print_line).with("01/05/2014 | 500 | 1400").ordered
    expect(@printer).to receive(:print_line).with("02/03/2014 | -100 | 900").ordered
    expect(@printer).to receive(:print_line).with("01/04/2014 | 1000 | 1000").ordered
  end

end
