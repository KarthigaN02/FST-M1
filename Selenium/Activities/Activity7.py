# Import webdriver from selenium
from selenium import webdriver
from selenium.webdriver.common.by import By

# Start the Driver
with webdriver.Firefox() as driver:
    #Open a new browser to https://training-support.net/webelements/dynamic-controls
    driver.get("https://training-support.net/webelements/dynamic-controls")

    #Get the title of the page and print it to the console
    print("Page title is: ", driver.title)
    
	#Find the text field.
    textbox = driver.find_element(By.ID, "textInput")

    #Check if the text field is enabled and print it.
    print("Textbox is enabled: ", textbox.is_enabled())

    #Click the "Enable Input" button to enable the input field.
    driver.find_element(By.ID, "textInputButton").click()
    
    #Check if the text field is enabled again and print it.
    print("Textbox is enabled: ", textbox.is_enabled())