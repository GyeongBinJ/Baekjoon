#include <iostream>
#include <stack>
#include <queue>

using namespace std;

int main()
{	
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	
	int n, k;
	queue<int> q;

	cin >> n >> k;

	cout << "<";

	for (int i = 1; i <= n; i++) {
		q.push(i);
	}

	while (!q.empty()) {
		for (int i = 0; i < k; i++) {
			if (i == k - 1) {
				int num = q.front();
				q.pop();

				if (q.size() == 0) {
					cout << num;
				}
				else {
					cout << num << ", ";
				}
			}
			else {
				q.push(q.front());
				q.pop();
			}
		}
	}

	cout << ">";

	return 0;
}