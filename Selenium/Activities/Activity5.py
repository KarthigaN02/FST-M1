from selenium import webdriver
from selenium.webdriver.common.by import By

# Start the Driver
with webdriver.Firefox() as driver:
    #Open a new browser to https://training-support.net/webelements/dynamic-controls
    driver.get("https://training-support.net/webelements/dynamic-controls")

    #Get the title of the page and print it to the console.
    print("Page title is: ", driver.title)
    
    #On the page, perform:
	#Find the checkbox input element.
    checkbox = driver.find_element(By.ID, "checkbox")

    #Check if it is visible on the page.
    checkbox_toggle = driver.find_element(By.XPATH, "//button[text()='Toggle Checkbox']")
    print("Checkbox visible: ", checkbox.is_displayed())

    #Click the "Remove Checkbox" button.
    checkbox_toggle.click()
    #Check if it is visible again and print the result.
    print("Checkbox visible: ", checkbox.is_displayed())