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
	stack<int> s;

	cin >> n;

	int student;

	for (int i = 0; i < n; i++) {
		cin >> student;
		q.push(student);
	}

	int start = 1;

	while (!q.empty()) {
		if (q.front() == start) {
			q.pop();
			start++;
		}
		else if (!s.empty() && s.top() == start) {
			s.pop();
			start++;
		}
		else {
			s.push(q.front());
			q.pop();
		}
	}

	while (!s.empty()) {
		if (s.top() == start) {
			s.pop();
			start++;
		}
		else {
			cout << "Sad";
			return 0;
		}
	}
	
	cout << "Nice";

	return 0;
}