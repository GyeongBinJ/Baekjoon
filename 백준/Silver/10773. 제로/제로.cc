#include <iostream>
#include <stack>

using namespace std;

int main()
{	
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	
	stack<int> stack;

	int k;
	cin >> k;

	while (k-- > 0) {
		int n;
		cin >> n;

		if (n == 0) {
			stack.pop();
		}
		else {
			stack.push(n);
		}
	}

	int sum = 0;

	while (!stack.empty()) {
		sum += stack.top();
		stack.pop();
	}

	cout << sum;

	return 0;
}