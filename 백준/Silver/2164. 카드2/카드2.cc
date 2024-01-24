#include <iostream>
#include <stack>
#include <queue>

using namespace std;

int main()
{	
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	
	int n;
	queue<int> q;

	cin >> n;

	for (int i = 0; i < n; i++) {
		q.push(i + 1);
	}

	while (q.size() != 1) {
		q.pop();

		int num = q.front();
		q.pop();
		q.push(num);
	}

	while (!q.empty()) {
		cout << q.front();
		q.pop();
	}

	return 0;
}