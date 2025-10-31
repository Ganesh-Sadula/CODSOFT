# Get operator and numbers from user
operator = input("Choose an operator (+, -, *, /): ")
num1 = float(input("Enter the first number: "))
num2 = float(input("Enter the second number: "))

# Perform calculation based on operator
if operator == "+":
    result = num1 + num2
    print("The result is:", result)
elif operator == "-":
    result = num1 - num2
    print("The result is:", result)
elif operator == "*":
    result = num1 * num2
    print("The result is:", result)
elif operator == "/":
    if num2 != 0:
        result = num1 / num2
        print("The result is:", result)
    else:
        print("Cannot divide by zero. Enter a valid number.")
else:
    print(f"{operator} is not a valid operator")

