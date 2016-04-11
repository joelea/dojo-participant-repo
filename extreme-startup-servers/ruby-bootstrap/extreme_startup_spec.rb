require './extreme_startup'

describe ExtremeStartup do

  it "parses numeric question" do
    answer = ExtremeStartup.new.answer("what the sum of 4 and 12")
    expect(answer).to eq "16"
  end

end
