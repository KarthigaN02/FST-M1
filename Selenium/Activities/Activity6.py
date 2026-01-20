from selenium import webdriver
from selenium.webdriver.common.by import By

# Start the Driver
with webdriver.Firefox() as driver:
    #Open a new browser to https://training-support.net/webelements/dynamic-controls
    driver.get("https://training-support.net/webelements/dynamic-controls")

    #Get the title of the page and print it to the console.
    print("Page title is: ", driver.title)

	#Find the checkbox input element.
    checkbox = driver.find_element(By.ID, "checkbox")
    # Click it
    #checkbox.click()

    #Check if the checkbox is selected and print the result.
    print("Checkbox is visible: ", checkbox.is_selected())
    #Click the checkbox to select it.
    checkbox.click()
    # Check if the checkbox is selected again and print the result.
    print("Checkbox is visible: ", checkbox.is_selected())