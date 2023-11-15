#include <iostream>
#include <stack>
using namespace std;

int main()
{	
	int n, b, tmp;
	
	stack<char> stack;

	cin >> n >> b;

	while (n != 0)
	{
		tmp = n % b;
		if (tmp > 9) {
			tmp = tmp + 'A' - 10;
			stack.push(tmp);
		}
		else
		{
			stack.push('0' + tmp);
		}
		n /= b;

	}

	while (!stack.empty()) {
		cout << stack.top();
		stack.pop();
	}
	return 0;
}