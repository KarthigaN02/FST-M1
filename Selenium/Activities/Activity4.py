from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.color import Color

# Start the Driver
with webdriver.Firefox() as driver:
    #Open a new browser to https://training-support.net/webelements/target-practice
    driver.get("https://training-support.net/webelements/target-practice")

    #Get the title of the page and print it to the console.
    print("Page title is: ", driver.title)
    
    #using xpath:
    # Find the 3rd header on the page and print it's text to the console. 
    third_heading = driver.find_element(By.XPATH, "//h3[contains(text(), '#3')]")
    print("Third heading text is: ", third_heading.text)

    #Find the 5th header on the page and print it's color.
    fifth_heading_color = Color.from_string(driver.find_element(By.XPATH, "//h5[contains(text(), '#5')]").value_of_css_property("color"))
    print("Fifth heading colour as Hexcode: ", fifth_heading_color.hex)
    print("Fifth heading colour as RGB: ", fifth_heading_color.rgb)

    #using other locators
    #Find the purple button and print all it's classes.
    purple_button = driver.find_element(By.XPATH, "//button[text()='Purple']")
    print("Purple button's classes are: ", purple_button.get_attribute("class"))

    #Find the slate button and print it's text.
    slate_button = driver.find_element(By.XPATH, "//button[contains(@class, 'slate')]")
    print("Text in slate button is: ", slate_button.text)