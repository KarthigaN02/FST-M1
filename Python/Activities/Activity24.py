import pytest

#Create a fixture named wallet() that initializes the variable 'amount' with 0
@pytest.fixture
def wallet():
   amount = 0
   return amount


@pytest.mark.parametrize("earned, spent, expected", [ (30, 10, 20), (20, 2, 18), ])
def test_transactions(wallet, earned, spent, expected):
	
    #add {earned} units of cash to the wallet
    wallet += earned

    # spend {spent} units of cash - substraction
    wallet -= spent

    # should have {expected} units of cash remaining after the two transactions - Assertion
    assert wallet == expected